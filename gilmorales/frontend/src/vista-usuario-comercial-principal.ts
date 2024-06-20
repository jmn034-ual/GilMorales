import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: fixed; padding: 0px; margin: 0px; flex-direction: column; display: flex; justify-content: flex-start; overflow-y: auto;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="cabecera" style="align-items: flex-start; flex-shrink: 0; z-index:9999; height: 60px; padding: 0px; margin: 0px; width: 100%;"></vaadin-horizontal-layout>
 <vaadin-vertical-layout id="vaadinVerticalLayout1" style="flex-grow: 1; width: 100%; flex-shrink: 0; justify-content: flex-start; background-color: #ffffff; display: flex; overflow-y: auto; align-items: center; padding: 0px;">
  <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="align-self: stretch; align-items: center; justify-content: flex-start; padding-top: var(--lumo-space-s); flex-shrink: 0; padding-right: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="flex-grow: 0; justify-content: flex-end; width: 8%; margin-left: var(--lumo-space-xl);">
    <vaadin-avatar id="vaadinAvatar" style="width: 100%; height: 100%; margin-left: var(--lumo-space-xl);"></vaadin-avatar>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing-xs" id="vaadinVerticalLayout2" style="flex-grow: 0; height: 100%; flex-shrink: 0; padding-left: var(--lumo-space-m);">
    <h2 id="nombreDeUsuario">NombreDeUsuario</h2>
    <h3 id="nombreDeEmpresa">NombreDeEmpresa</h3>
    <vaadin-button id="editarPerffilB">
      Editar perfil 
    </vaadin-button>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="justify-content: center;">
     <label id="numeroL">0</label>
     <label id="meGustasL">Me gustas</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="flex-grow: 1; justify-content: flex-end; flex-shrink: 0; margin-left: var(--lumo-space-l);">
    <vaadin-button id="eliminarPublicacion" style="flex-grow: 0;">
      Eliminar publicación 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4" style="justify-content: flex-start; height: 5%; align-content: center; flex-wrap: wrap; margin-left: var(--lumo-space-m); align-self: stretch;">
   <label id="descripcion" style="flex-grow: 0; flex-shrink: 0; padding-left: var(--lumo-space-l);">Descripción del perfil de la empresa</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5" style="width: 10%; justify-content: center; height: 8%; margin-left: var(--lumo-space-m); align-self: stretch;">
   <h2 id="h2">Videos</h2>
  </vaadin-horizontal-layout>
  <hr style="width: 98%; align-self: center; flex-shrink: 0; height: 2px;">
  <vaadin-vertical-layout id="listaVideos" style="flex-grow: 1; width: 100%; flex-shrink: 0; justify-content: flex-start; background-color: #ffffff; display: flex; overflow-y: auto; padding-bottom: 2%; align-items: center; align-self: center;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
