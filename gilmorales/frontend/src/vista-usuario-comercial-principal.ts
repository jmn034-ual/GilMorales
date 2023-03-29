import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-usuario-comercial-principal')
export class VistaUsuarioComercialPrincipal extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="cabecera" style="width: 100%; height: 10%;"></vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="flex-grow: 1; width: 95%; align-self: center; height: 95%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: flex-start; align-items: center; width: 100%;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="flex-grow: 0; justify-content: flex-end; width: 8%;">
    <img id="fotoDePerfil">
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="flex-grow: 1; height: 90%;">
    <h2 id="nombreDeUsuario">NombreDeUsuario</h2>
    <h3 id="nombreDeEmpresa">NombreDeEmpresa</h3>
    <vaadin-button id="editarPerffilB">
     Editar perfil 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="flex-grow: 1; justify-content: center;">
    <vaadin-button id="eliminarPublicacion" style="flex-grow: 0;">
     Eliminar publicación
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 20%; justify-content: center;">
   <label id="numeroL">0</label>
   <label id="meGustasL">Me gustas</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4" style="width: 100%; justify-content: flex-start; height: 5%; align-content: center; flex-wrap: wrap;">
   <label id="descripcion" style="flex-grow: 1;">Descripción del perfil de la empresa</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5" style="width: 10%; align-self: flex-start; justify-content: center; height: 8%;">
   <h2 id="h2">Videos</h2>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="listaVideos" style="flex-grow: 1; width: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
