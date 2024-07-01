import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-lista-usuarios-item')
export class VistaListaUsuariosItem extends LitElement {
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
<vaadin-horizontal-layout id="vaadinHorizontalLayout" style="z-index: 11; align-items: center; border-radius: 10px; box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.2); padding: var(--lumo-space-m); width: 100%; border-radius: 18px; border: 2px solid #F5F5F5; background-color: white;">
 <vaadin-vertical-layout id="layoutPublicacion" style="align-items: center; align-self: center; flex-shrink: 1;"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="labelInformacion" style="flex-grow: 0; flex-shrink: 1; z-index: 12; align-self: center;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
   <vaadin-avatar id="fotoPerfil" style="align-self: center;"></vaadin-avatar>
   <vaadin-button theme="tertiary" id="botonNombreUsuario" style="z-index: 999;">
     NombreUsuario 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <label id="labelNombreCompleto">Nombre Completo Usuario</label>
  <label id="labelDescripcion">Descripción corta</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
