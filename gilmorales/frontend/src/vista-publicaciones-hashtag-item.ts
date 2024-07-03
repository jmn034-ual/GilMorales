import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-publicaciones-hashtag-item')
export class VistaPublicacionesHashtagItem extends LitElement {
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
<vaadin-horizontal-layout class="content" id="layoutItem" style="z-index: 11; align-items: center; border-radius: 10px; box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.2);">
 <vaadin-vertical-layout id="vaadinVerticalLayout" style="flex-grow: 0; overflow: hidden; flex-shrink: 0; width: 500px;  background-color: black; color: white;    border-radius: 10px;box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.2);">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="border-radius: 10px; background-color: #F5F5F5; align-self: center; flex-shrink: 0; width: 90%; margin: var(--lumo-space-m); padding: var(--lumo-space-s); height: 140px;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: flex-start; align-items: center;">
    <vaadin-avatar id="vaadinAvatar"></vaadin-avatar>
    <vaadin-button theme="tertiary" id="botonNombreUsuario" style="color: black; font-weight: bold;">
      NombreUsuario 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <label id="descripcion" style="flex-grow: 0; align-self: flex-start; color: black; margin-left: var(--lumo-space-s);">Label</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="imagenPublicacion" style="align-self: center; flex-grow: 0; flex-shrink: 0; display: flex; justify-content: center; align-items: center; overflow: hidden; height: 700px; background-color: black; width: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
