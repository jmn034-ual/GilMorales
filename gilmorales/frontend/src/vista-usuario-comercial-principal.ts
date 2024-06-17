import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: fixed; overflow-y: auto; " id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="cabecera" style="align-self: stretch; align-items: center; flex-shrink: 0; z-index:999;"></vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing-s" id="vaadinVerticalLayout1" style="flex-grow: 1; position:fixed; width: 100%; margin-top: 6%; overflow-y: auto; flex-shrink: 0; height: 95%; justify-content: flex-start; background-color: #ffffff;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: flex-start; align-items: center; width: 100%; justify-content: flex-start;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="flex-grow: 0; justify-content: flex-end; width: 8%; margin-left: var(--lumo-space-xl);">
    <vaadin-avatar id="vaadinAvatar" style="width: 100%; height: 100%; margin-left: var(--lumo-space-xl);"></vaadin-avatar>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="flex-grow: 0; height: 100%; margin-top: var(--lumo-space-s);">
    <h2 id="nombreDeUsuario">NombreDeUsuario</h2>
    <h3 id="nombreDeEmpresa">NombreDeEmpresa</h3>
    <vaadin-button id="editarPerffilB" style="margin-left: var(--lumo-space-s);">
      Editar perfil 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="flex-grow: 1; justify-content: flex-end; flex-shrink: 0; margin-left: var(--lumo-space-l);">
    <vaadin-button id="eliminarPublicacion" style="flex-grow: 0; margin-left: 5%;">
      Eliminar publicación 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 20%; justify-content: center; margin-left: var(--lumo-space-m);">
   <label id="numeroL">0</label>
   <label id="meGustasL">Me gustas</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4" style="width: 100%; justify-content: flex-start; height: 5%; align-content: center; flex-wrap: wrap; margin-left: var(--lumo-space-m);">
   <label id="descripcion" style="flex-grow: 1;">Descripción del perfil de la empresa</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5" style="width: 10%; justify-content: center; height: 8%; margin-left: var(--lumo-space-m);">
   <h2 id="h2">Videos</h2>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="listaVideos" style="flex-grow: 1; z-index:999; flex-shrink: 0; align-self: stretch;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
